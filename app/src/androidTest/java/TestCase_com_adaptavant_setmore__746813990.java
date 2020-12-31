import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adaptavant_setmore__746813990 {
   @Test
   public void testCase() throws Exception {
      PropertyValuesHolder[] var2 = new PropertyValuesHolder[3];
      Object var1 = EasyMock.createMock(View.class);
      ObjectAnimator var3 = ObjectAnimator.ofPropertyValuesHolder(var1, var2);
      var3 = var3.clone();
   }
}
