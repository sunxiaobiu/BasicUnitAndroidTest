import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F11FDEFF567AF8E29BB8C01674605340284B0198D3B0F7E0AE7B13202477E64__579940406 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      File var1 = ContextCompat.getNoBackupFilesDir((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
