package src;

public class issResponse{
    private posicao iss_Possition;
    private long timestamp;
    private String message;

    public posicao getIss_Possition() {
        return iss_Possition;
    }
    public void setIss_Possition(){
        this.iss_Possition= iss_Possition;

    }
    public posicao getTimestamp() {
        return timestamp;
    }
    public void seTimestamp(){
        this.timestamp= timestamp;

    }
}

class posição{
    private String longitude;
    private String latitude;

    public String getLongitude(){
        return longitude;

    }
    public String getLatitude(){
        return latitude;
    
    }

    public void setLongitude(){
        this.longitude= longitude;

    }
    public void setLatitude(){
        this.longitude = longitude;
        
    }

    public double getLatAsDouble(){
        return double.parseDouble(latitude);
    }
    public double getLonAsDouble(){
        return double.parseDouble(longitude){

        }
    }

}