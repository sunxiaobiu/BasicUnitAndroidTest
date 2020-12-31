import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airasiago_android__1846354974 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppCompatActivity.class);
      ((AppCompatActivity)var1).postponeEnterTransition();
   }
}
