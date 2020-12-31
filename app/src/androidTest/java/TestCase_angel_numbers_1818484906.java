import android.media.ExifInterface;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers_1818484906 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var2 = new StringBuilder();
      String var3 = var2.toString();
      File var1 = new File(var3, "temp.jpg");
      var3 = var1.getAbsolutePath();
      Object var4 = EasyMock.createMock(String.class);
      ExifInterface var5 = new ExifInterface((String)var4);
      var3 = var5.getAttribute("Orientation");
   }
}
