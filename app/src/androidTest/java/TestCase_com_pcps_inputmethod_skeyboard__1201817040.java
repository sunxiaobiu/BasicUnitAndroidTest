import android.util.PrintWriterPrinter;
import androidx.test.runner.AndroidJUnit4;
import java.io.PrintWriter;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_pcps_inputmethod_skeyboard__1201817040 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PrintWriter.class);
      PrintWriterPrinter var1 = new PrintWriterPrinter((PrintWriter)var2);
      var1.println("LatinIME state :");
   }
}
