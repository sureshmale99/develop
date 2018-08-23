package com.client;

import com.amazon.webservices.awsecommerceservice._2011_08_01.AWSECommerceService;

public class IPFinder 
{
    public static void main( String[] args )
    {
    	
    	// Test end point 
    	// http://webservices.amazon.com/AWSECommerceService/AWSECommerceService.wsdl
    	// use command => wsimport -keep -s java http://webservices.amazon.com/AWSECommerceService/AWSECommerceService.wsdl
    	AWSECommerceService service = new AWSECommerceService();
    	System.out.println(service.getAWSECommerceServicePort() +"\n" + service.getAWSECommerceServicePortUK());
    	
    }
}
