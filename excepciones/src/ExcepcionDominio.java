public class ExcepcionDominio extends Exception {
    public ExcepcionDominio(){
    }
    public ExcepcionDominio(String message){
      super(message);
    }

  @Override
  public String getMessage() {
    return super.getMessage();
  }
}
