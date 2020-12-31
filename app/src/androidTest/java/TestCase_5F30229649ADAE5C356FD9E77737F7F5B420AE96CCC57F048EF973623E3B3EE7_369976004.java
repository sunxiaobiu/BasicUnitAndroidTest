import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F30229649ADAE5C356FD9E77737F7F5B420AE96CCC57F048EF973623E3B3EE7_369976004 {
   @Test
   public void testCase() throws Exception {
      PropertyValuesHolder[] var4 = new PropertyValuesHolder[2];
      Object var1 = EasyMock.createMock(View.class);
      ObjectAnimator var5 = ObjectAnimator.ofPropertyValuesHolder(var1, var4);
      long var2 = 1L;
      var5.setDuration(var2);
   }
}
