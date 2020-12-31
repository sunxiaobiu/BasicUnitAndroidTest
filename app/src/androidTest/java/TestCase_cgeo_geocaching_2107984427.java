import android.support.v7.app.ActionBarActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching_2107984427 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ActionBarActivity.class);
      boolean var1 = true;
      ((ActionBarActivity)var2).setSupportProgressBarIndeterminateVisibility(var1);
   }
}
