package com.example.java.tecese.JDBC.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;

//import org.apache.ibatis.jdbc.ScriptRunner;


public class RunningScripts {
    public void runDbScript() throws Exception {

        Connection con = DbUtil.getConnection();
       // ScriptRunner sr = new ScriptRunner(con);
        Reader reader = new BufferedReader(new FileReader("db.sql"));
      //  sr.runScript(reader);
    }
}