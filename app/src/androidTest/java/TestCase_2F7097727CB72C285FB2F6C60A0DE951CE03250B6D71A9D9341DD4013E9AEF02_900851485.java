import android.content.Context;
import androidx.appcompat.widget.TintTypedArray;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2F7097727CB72C285FB2F6C60A0DE951CE03250B6D71A9D9341DD4013E9AEF02_900851485 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      int[] var2 = new int[1];
      TintTypedArray.obtainStyledAttributes((Context)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
