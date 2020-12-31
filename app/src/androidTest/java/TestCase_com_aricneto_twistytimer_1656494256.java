import android.graphics.drawable.Drawable;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aricneto_twistytimer_1656494256 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      View var3 = ((LayoutInflater)var2).inflate(2130903187, (ViewGroup)null);
      SwitchCompat var4 = (SwitchCompat)var3;
      Object var1 = EasyMock.createMock(Drawable.class);
      var4.setThumbDrawable((Drawable)var1);
   }
}
