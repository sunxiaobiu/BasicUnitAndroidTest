import android.app.ActivityOptions;
import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_668066750AF2CB32A3E91408AC580B1B4ACB5CB319871AACC06E096384D58D06_1142169788 {
   @Test
   public void testCase() throws Exception {
      ActivityOptions var2 = ActivityOptions.makeBasic();
      Object var1 = EasyMock.createMock(Rect.class);
      var2.setLaunchBounds((Rect)var1);
   }
}
