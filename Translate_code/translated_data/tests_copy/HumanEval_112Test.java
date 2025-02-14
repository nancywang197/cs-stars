package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_112;
import org.junit.Test;
import static org.junit.Assert.*;

import android.util.Pair;

public class HumanEval_112Test {

    HumanEval_112 testClass = new HumanEval_112();

    @Test
    public void test1(){
        assertEquals(new Pair<>("bcd", false), testClass.reverse_delete("abcde","ae"));
    }
    @Test
    public void test2(){
        assertEquals(new Pair<>("acdef", false), testClass.reverse_delete("abcdef", "b"));
    }
    @Test
    public void test3(){
        assertEquals(new Pair<>("cdedc", true), testClass.reverse_delete("abcdedcba","ab"));
    }
    @Test
    public void test4(){
        assertEquals(new Pair<>("dik", false), testClass.reverse_delete("dwik","w"));
    }
    @Test
    public void test5(){
        assertEquals(new Pair<>("", true), testClass.reverse_delete("a","a"));
    }
    @Test
    public void test6(){
        assertEquals(new Pair<>("abcdedcba", true), testClass.reverse_delete("abcdedcba",""));
    }
    @Test
    public void test7(){
        assertEquals(new Pair<>("abcdedcba", true), testClass.reverse_delete("abcdedcba","v"));
    }
    @Test
    public void test8(){
        assertEquals(new Pair<>("abba", true), testClass.reverse_delete("vabba","v"));
    }
    @Test
    public void test9(){
        assertEquals(new Pair<>("", true), testClass.reverse_delete("mamma", "mia"));
    }
}
