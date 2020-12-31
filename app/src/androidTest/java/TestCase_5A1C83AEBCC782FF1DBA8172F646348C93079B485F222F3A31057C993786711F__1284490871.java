import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A1C83AEBCC782FF1DBA8172F646348C93079B485F222F3A31057C993786711F__1284490871 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      float var1 = 1.0F;
      ViewCompat.setPivotX((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
