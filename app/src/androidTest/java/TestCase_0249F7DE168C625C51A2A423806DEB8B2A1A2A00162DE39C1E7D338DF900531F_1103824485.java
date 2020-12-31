import android.animation.AnimatorInflater;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_1103824485 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      AnimatorInflater.loadAnimator((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
