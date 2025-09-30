package rest.warehouse;

import rest.model.ProductData;//ProductData importiert
import rest.model.WarehouseData;

import java.util.*;//Liste importiert

public class WarehouseSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public WarehouseData getData( String inID ) {
		
		WarehouseData data = new WarehouseData();
		data.setWarehouseID( inID );
		data.setWarehouseName( "Linz Bahnhof" );
        //neue Attribute befüllt
        data.setWarehouseAddress( "Bahnhofsstrasse 27/9" );
        data.setWarehousePostalCode("Linz");
        data.setWarehouseCity( "Linz" );
        data.setWarehouseCountry( "Austria" );

        //Produkte in die Liste eingefügt
        List<ProductData> productList = new ArrayList<>();
        productList.add(new ProductData("00-443175", "Bio Orangensaft Sonne", "Getraenk", 2500, "Packung 1L"));
        productList.add(new ProductData("00-871895", "Bio Apfelsaft Gold","Getraenk",3420,"Packung 1L"));
        productList.add(new ProductData("01-926885" , "Ariel Waschmittel Colo","Waschmittel",478,"Packung 3KG"));
        productList.add(new ProductData( "00-316253" ,"Persil Discs Color" ,"Waschmittel",1430,"Packung 700G"));
        productList.add(new ProductData( "00-316253" ,"Milka Schokolade" ,"Suesse Ware", 250,"Tafel 100G"));

        data.setProducts( productList );//Liste in warehouse eingefügt
		return data;
		
	}

}
