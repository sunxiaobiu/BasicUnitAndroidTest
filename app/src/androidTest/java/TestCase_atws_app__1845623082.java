import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__1845623082 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ImageView.class);
      String var1 = "android";
      ViewCompat.setTransitionName((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
