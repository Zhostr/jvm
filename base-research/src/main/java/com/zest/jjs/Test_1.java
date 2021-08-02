package com.zest.jjs;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created By ziya
 * 2021/1/3
 */
public class Test_1 {

    public static void main(String[] args) {
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");

        System.out.println(scriptEngine);
    }
}
