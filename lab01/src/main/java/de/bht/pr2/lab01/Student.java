package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) throws StudentParseException, RegistrationNumberException {
    // TODO: Here goes your code ...

    boolean Fee_bezahlt;

    String[] daten = dataRow.split(",");
    
    if(daten.length < 3 | daten.length > 3){
      throw new StudentParseException("Die Datenzeile konnte nicht korrekt gelesen werden ! Überprüfen Sie die Korrektheit der ganzen Zeile");
    }

    name = daten[0];
    try{
    registrationNumber = Integer.parseInt(daten[1]);
    }catch(Exception e){
      throw new RegistrationNumberException("Die Nummer hat das falsche Format !");
    }
    courseOfStudies = daten[2];

    if(Integer.parseInt(daten[3]) == 312){
      Fee_bezahlt = true;
    }else{
      Fee_bezahlt = false;
    }
    
    
    /* 
    for (String datenEinzeln : daten){
    
    }
    */
  }
}
