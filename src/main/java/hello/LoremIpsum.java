package hello;

public class LoremIpsum {

    private final long id;
    private final String content;
    
    /*
    http://www.lipsum.com
    Section 1.10.32 of "de Finibus Bonorum et Malorum", written by Cicero in 45 BC
    */
	private final String txt1 = 
	    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor "
	  + "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis "
	  + "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
	  + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu "
	  + "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
	  + "culpa qui officia deserunt mollit anim id est laborum.";
	  
    /*
    http://www.lipsum.com
    Section 1.10.33 of "de Finibus Bonorum et Malorum", written by Cicero in 45 BC
    */
	private final String txt2 =
	    "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium "
	  + "doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore "
	  + "veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam"
	  + " voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia "
	  + "consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque "
	  + "porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, "
	  + "adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et "
	  + "dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis "
	  + "nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex "
	  + "ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea "
	  + "voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem "
	  + "eum fugiat quo voluptas nulla pariatur?";
	private final String txt3 = txt1 + "\n" + txt2;
	  
    public LoremIpsum(long id, long len) {
        this.id = id;
        StringBuilder sb = new StringBuilder();
        long txtLen = txt3.length();
        
        int chunkSize = 0;
        while (sb.length() < len) {
          chunkSize = (int)Math.min((len - sb.length()), txtLen);
          
          if (chunkSize == txtLen) {
            sb.append(txt3);
            
            if ((len - sb.length()) > 0) {
              sb.append("\n");
            }
            
          } else {
            sb.append(txt3.substring(0, chunkSize));
          }
          
        }
        
        this.content = sb.toString();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
