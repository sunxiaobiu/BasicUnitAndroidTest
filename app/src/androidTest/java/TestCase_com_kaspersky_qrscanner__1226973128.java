import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_kaspersky_qrscanner__1226973128 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(LayoutInflater.class);
      LayoutInflaterFactory var1 = LayoutInflaterCompat.getFactory((LayoutInflater)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
