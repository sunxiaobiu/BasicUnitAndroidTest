import android.hardware.Camera;
import android.hardware.Camera.OnZoomChangeListener;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dja_onrecord_android_activities__1213424722 {
   @Test
   public void testCase() throws Exception {
      Camera var2 = Camera.open();
      Object var1 = null;
      var2.setZoomChangeListener((OnZoomChangeListener)var1);
   }
}
