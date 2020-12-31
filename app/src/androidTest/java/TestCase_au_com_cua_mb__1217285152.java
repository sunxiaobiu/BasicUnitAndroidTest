import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__1217285152 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      Object var1 = null;
      ViewCompat.postOnAnimation((View)var0, (Runnable)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
