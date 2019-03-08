package Reflector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ReflectTest {

    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();
        Fruit fruit = (Fruit) Proxy.newProxyInstance(ReflectTest.class.getClassLoader(), apple.getClass().getInterfaces(), new MyInvocationHandler(apple));
        fruit.squeez();
    }
}
