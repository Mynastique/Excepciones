public class ExcepcionInicio extends Exception {
    public ExcepcionInicio(){
    }
    public ExcepcionInicio(String message){
      super(message);
    }

  @Override
  public String getMessage() {
    return super.getMessage();
  }
}
