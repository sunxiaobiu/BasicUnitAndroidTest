import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_1288977102 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppCompatActivity.class);
      ActionBar var2 = ((AppCompatActivity)var1).getSupportActionBar();
      boolean var3 = var2.isShowing();
   }
}
