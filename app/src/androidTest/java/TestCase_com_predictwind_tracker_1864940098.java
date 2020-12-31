import android.support.v7.widget.AppCompatSpinner;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_predictwind_tracker_1864940098 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatSpinner.class);
      boolean var1 = true;
      ((AppCompatSpinner)var2).setEnabled(var1);
   }
}
