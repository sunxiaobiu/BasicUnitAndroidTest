import android.graphics.Bitmap;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_vic_ptv__1659523402 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = EasyMock.createMock(ViewGroup.class);
      View var3 = ((LayoutInflater)var2).inflate(2130903096, (ViewGroup)var1, false);
      var3 = var3.findViewById(2131558655);
      FloatingActionButton var4 = (FloatingActionButton)var3;
      var1 = EasyMock.createMock(Bitmap.class);
      var4.setImageBitmap((Bitmap)var1);
   }
}
