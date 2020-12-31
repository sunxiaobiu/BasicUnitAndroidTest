import android.content.Context;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_eatnow_android__2116021047 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      int[] var1 = new int[1];
      TintTypedArray.obtainStyledAttributes((Context)var0, (AttributeSet)null, var1, 0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
