import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_sdtps_1396416506 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppCompatActivity.class);
      FragmentManager var2 = ((AppCompatActivity)var1).getSupportFragmentManager();
      var2.popBackStack();
   }
}
