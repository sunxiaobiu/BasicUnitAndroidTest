import android.graphics.pdf.PdfRenderer;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_buildfortheweb_tempus_334923970 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var1 = new StringBuilder();
      File var3 = Environment.getExternalStorageDirectory();
      String var2 = var3.getPath();
      var1 = var1.append(var2);
      String var5 = var1.toString();
      File var7 = new File(var5);
      ParcelFileDescriptor var4 = ParcelFileDescriptor.open(var3, 268435456);
      PdfRenderer var6 = new PdfRenderer(var4);
      var6.close();
   }
}
