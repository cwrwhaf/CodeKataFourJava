package com.cwrw.haf;

import com.cwrw.haf.kata.CodeKata;
import com.cwrw.haf.repository.LeagueTableDao;

/**
 * Code Kata
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.run();
    }
    
    public void run(){
    	CodeKata codeKata = new CodeKata(new LeagueTableDao());
    	
    	System.out.println(codeKata.partTwo());
    }
}
