public class मुख्य {
  public static void main(String[] args) {
    System.out.println("शुरू मुख्य तरीका ");
    String नाम = "राहुल";
    दस्तावेज़ दस्तावेज़ = new दस्तावेज़(नाम);
    System.out.println(दस्तावेज़.प्रतिलिपि());
  }
}

class दस्तावेज़ {
  private String नाम;

  public दस्तावेज़(String नाम) {
    this.नाम = नाम;
  }

  public String प्रतिलिपि() {
    return "दस्तावेज़ [नाम=" + नाम + "]";
  }
}
