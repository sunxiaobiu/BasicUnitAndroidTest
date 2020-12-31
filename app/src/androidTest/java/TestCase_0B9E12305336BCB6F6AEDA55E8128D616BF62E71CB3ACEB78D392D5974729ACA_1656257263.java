import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0B9E12305336BCB6F6AEDA55E8128D616BF62E71CB3ACEB78D392D5974729ACA_1656257263 {
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
