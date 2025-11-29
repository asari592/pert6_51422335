package app_6TI10;

public class ThermometerTest 
{
    public static void main(String[] args)
    {
        Thermometer t1;
        // Thermometer t1 = new Thermometer(0.0);
        
        System.out.println("Pengujian Aplikasi Thermometer");
        System.out.println("Nilai Celcius Yang Dimasukkan adalah 50");
        System.out.println("Dengan Penanganan Kondisi Pemasukan Nilai Tak Absah");
        System.out.println("Memanfaatkan Structured Exception Handling");
        System.out.println("===================================================");
        
        try
        {
            t1 = new Thermometer(0.0);
            
            System.out.println("Nilai di Celcius : "+t1.getInCelcius());
            System.out.println("Nilai di Reamur : "+t1.getInReamur());
            System.out.println("Nilai di Fahrenheit : "+t1.getInFahrenheit());
            System.out.println("Nilai di Kelvin : "+t1.getInKelvin());
            
            try
            {
                t1.setInCelcius(50.0);
                System.out.println("Nilai di Celcius : "+t1.getInCelcius());
                System.out.println("Nilai di Reamur : "+t1.getInReamur());
                System.out.println("Nilai di Fahrenheit : "+t1.getInFahrenheit());
                System.out.println("Nilai di Kelvin : "+t1.getInKelvin());
            } 
            catch(Exception e) 
            {
                System.out.println ("Exception : " + e.getMessage());                
            }
            
            try 
            {
                t1.setInCelcius(-273.0);
                System.out.println("Nilai di Celcius : "+t1.getInCelcius());
                System.out.println("Nilai di Reamur : "+t1.getInReamur());
                System.out.println("Nilai di Fahrenheit : "+t1.getInFahrenheit());
                System.out.println("Nilai di Kelvin : "+t1.getInKelvin());
            }
            catch(Exception e)
            {
                System.out.println ("Exception : " + e.getMessage());                
            }
            
        } // most outer try
        catch(Exception e)
        {
            System.out.println ("Exception : " + e.getMessage());            
        }
        
    } // end of main method
    
} // end of class ThermometerTest