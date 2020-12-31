import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_63147E0A8BC983897D23AE728E025C584E6253AFBFD1E28A54FF1B8361545FC0__1147136757 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatActivity.class);
      Object var1 = EasyMock.createMock(Intent.class);
      ((AppCompatActivity)var2).startForegroundService((Intent)var1);
   }
}
