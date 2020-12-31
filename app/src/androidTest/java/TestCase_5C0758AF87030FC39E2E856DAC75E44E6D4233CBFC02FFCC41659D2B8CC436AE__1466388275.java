import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5C0758AF87030FC39E2E856DAC75E44E6D4233CBFC02FFCC41659D2B8CC436AE__1466388275 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppCompatActivity.class);
      ActionBar var2 = ((AppCompatActivity)var1).getSupportActionBar();
      var2.removeAllTabs();
   }
}
