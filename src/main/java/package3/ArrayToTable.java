package package3;

import java.util.Scanner;

public class ArrayToTable {

	public static void main(String[] args) {
		int[] igry = {1896,1900,1904,1906,1908,1912,1916,1920,1924,1924,1928,1928,1932,1932,1936,1936,1940,1940,1944,1944,1948,1948,1952,1952,1956,1956,1960,1960,1964,1964,1968,1968,1972,1972,1976,1976,1980,1980,1984,1984,1988,1988,1992,1992,1994,1996,1998,2000,2002,2004,2006,2008,2010,2012,2014,2016,2018,2020,2022};
		String[] krajina = {"Greece","France","United States","Greece","United Kingdom","Sweden","Germany","Belgium","France","France","Switzerland","Netherlands","United States","United States","Nazi Germany","Nazi Germany","Nazi Germany","Finland","Italy","United Kingdom","Switzerland","United Kingdom","Norway","Finland","Italy","Australia, Sweden","United States","Italy","Austria","Japan","France","Mexico","Japan","West Germany","Austria","Canada","United States","Soviet Union","Yugoslavia","United States","Canada","South Korea","France","Spain","Norway","United States","Japan","Australia","United States","Greece","Italy","China","Canada","United Kingdom","Nazi Russia","Brazil","South Korea","Japan","China"};
		String[] misto = {"Athens","Paris","St. Louis","Athens","London","Stockholm","Berlin","Antwerp","Chamonix","Paris","St. Moritz","Amsterdam","Lake Placid","Los Angeles","Garmisch-Partenkirchen","Berlin","Garmisch-Partenkirchen","Helsinki","Cortina d'Ampezzo","London","St. Moritz","London","Oslo","Helsinki","Cortina d'Ampezzo","Melbourne, Stockholm","Squaw Valley","Rome","Innsbruck","Tokyo","Grenoble","Mexico City","Sapporo","Munich","Innsbruck","Montreal","Lake Placid","Moscow","Sarajevo","Los Angeles","Calgary","Seoul","Albertville","Barcelona","Lillehammer","Atlanta","Nagano","Sydney","Salt Lake City","Athens","Turin","Beijing","Vancouver","London","Sochi","Rio de Janeiro","Pyeongchang","Tokyo","Beijing"};
		
//		System.out.println("Index\tRik\tKrajina i tMisto");
//		for (int i = 0; i < igry.length; i++)
//		{
//			System.out.print(i + "\t");
//			System.out.print(igry[i] + "\t");
//			System.out.print(krajina[i] + " - " + misto[i] + "\n");
//			
//			
//		}
		System.out.println("Vvedit rik: ");
		Scanner skan = new Scanner(System.in);
		int rik = skan.nextInt();
		boolean znajdeno = false;
		for (int j = 0; j < igry.length; j++)
		{
			if (igry[j] == rik)
			{
				System.out.print(j + "\t");
				System.out.print(igry[j] + "\t");
				System.out.print(krajina[j] + " - " + misto[j] + "\n");
				znajdeno = true;
			}
		}
		if (!znajdeno)
		{
			System.out.println("U vvedenomu roci igry ne vidbuvalysja");
		}
		
	}

}
