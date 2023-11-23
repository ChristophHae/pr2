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
   * @throws WrongCourseOfStudiesException
   */
  public Student(String dataRow) throws StudentParseException, RegistrationNumberException, WrongCourseOfStudiesException {
    // TODO: Here goes your code ...

    boolean Fee_bezahlt;

    String[] daten = dataRow.split(",");
    
    if(daten.length < 4 | daten.length > 4){
      throw new StudentParseException("Die Datenzeile konnte nicht korrekt gelesen werden: " + dataRow);
    }

    name = daten[0];
    try{
    registrationNumber = Integer.parseInt(daten[1]);
    }catch(Exception e){
      throw new RegistrationNumberException("Die Nummer hat das falsche Format: " + daten[1]);
    }
    
    courseOfStudies = daten[2];
    if(courseOfStudies.equalsIgnoreCase("Medieninformatik") | courseOfStudies.equalsIgnoreCase("Technische Informatik") | courseOfStudies.equalsIgnoreCase("Druck- und Medientechnik") | courseOfStudies.equalsIgnoreCase("Screen Based Media")){
      }else{
      throw new WrongCourseOfStudiesException("Falscher Studiengang: " + daten[2]);
    }

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
