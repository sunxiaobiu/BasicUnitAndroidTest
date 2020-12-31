import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aricneto_twistytimer_755610234 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LayoutInflater.class);
      View var2 = ((LayoutInflater)var1).inflate(2130903187, (ViewGroup)null);
      SwitchCompat var3 = (SwitchCompat)var2;
      var3.setTrackResource(2130837724);
   }
}
