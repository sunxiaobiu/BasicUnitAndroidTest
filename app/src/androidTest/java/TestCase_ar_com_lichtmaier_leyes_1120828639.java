import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes_1120828639 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ImageView.class);
      ViewPropertyAnimatorCompat var2 = ViewCompat.animate((View)var1);
      var2 = var2.withLayer();
   }
}
