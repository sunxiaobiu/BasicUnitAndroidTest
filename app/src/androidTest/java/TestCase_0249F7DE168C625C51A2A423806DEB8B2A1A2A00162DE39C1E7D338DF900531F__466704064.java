import android.os.Handler;
import android.os.Looper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__466704064 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Looper.class);
      Handler var1 = Handler.createAsync((Looper)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
