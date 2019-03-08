package NIOTest;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestBlockingNIO {

    public static void main(String[] args) throws IOException {
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1",9898));
        FileChannel inChannel = FileChannel.open(Paths.get("1.jpg"), StandardOpenOption.READ);
        ByteBuffer buff = ByteBuffer.allocate(1024);
        while(inChannel.read(buff)!=-1){
            buff.flip();
            sChannel.write(buff);
            buff.clear();
        }
        inChannel.close();
        sChannel.close();
    }

    @Test
    public void Server() throws IOException {
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        FileChannel outChannel = FileChannel.open(Paths.get("2.jpg"),StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);
        ssChannel.bind(new InetSocketAddress(9898));
        SocketChannel sChannel = ssChannel.accept();
        ByteBuffer buff = ByteBuffer.allocate(1024);
        while(sChannel.read(buff)!=-1){
            buff.flip();
            outChannel.write(buff);
            buff.clear();
        }
        ssChannel.close();
        sChannel.close();
        outChannel.close();
    }
}
