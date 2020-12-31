import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.ImageButton;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_opal_travel_61646431 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ImageButton.class);
      ViewCompat.performAccessibilityAction((View)var0, 64, (Bundle)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
