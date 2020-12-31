import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_edunext_bism__1808596758 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Drawable.class);
      TransitionDrawable var2 = (TransitionDrawable)var1;
      var2.resetTransition();
   }
}
