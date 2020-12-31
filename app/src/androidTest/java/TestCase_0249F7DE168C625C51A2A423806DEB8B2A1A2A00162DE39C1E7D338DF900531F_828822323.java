import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_828822323 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      String var1 = "android";
      Fragment.instantiate((Context)var0, var1, (Bundle)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
