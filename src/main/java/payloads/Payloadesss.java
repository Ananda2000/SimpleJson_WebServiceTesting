package payloads;

public class Payloadesss 
{
	public static String CreateBooking()
	{
		return "{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}";
	}
	
	public static String putPayload()
	{
		return "{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"ananda-16-april-2023\"}";

	}
	
	public static String Auth_Request_payload()
	{
		return "{\"username\":\"admin\",\"password\":\"password123\"}";
	}

}
