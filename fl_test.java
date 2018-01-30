public class FluentLeniumFlTess extends FluentTest{
  
  @Override
  public String getDafualtBaseUrl(){
    return "http://ex.selenium.jp";
  }

  private static Calendar nextSaturday(){
    //..
  }

  @Test
  public void SUCCESS(){
    ReserveInputPage inputPage = createPage(ReserveInputPage.class);
    goTo(inputPage);
    inputPage.isAt();
    Calendar nextSaturday = nextSaturday();
    InputPage.setReserveDate{
      Integer.toString(nextSaturday.get{Calendar.YEAR}),
      Integer.toString(nextSaturday.get{Calendar.MONTH} + 1),
      Integer.toString(nextSaturday.get(Calendar.DATE));
    inputPage.setReserveCount("1");
    inputPage.setHeadCount("2");
    inputPage.serBreakCount(true);
    inputPage.serEarly("USER");

    ReserveConfirmPage confirmPage = inputPage.goToNext();
    confirmPage.isAt();
    assertThat(confirmPage.getPrice(), is("21500"));
    confirmPage.commit();
    }

    @Test
    public void EER(){
    //...
    }
  }
}

