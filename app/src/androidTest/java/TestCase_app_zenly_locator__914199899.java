import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator__914199899 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = EasyMock.createMock(ViewGroup.class);
      View var3 = ((LayoutInflater)var2).inflate(2131558461, (ViewGroup)var1, false);
      var3 = var3.findViewById(2131427599);
      RecyclerView var4 = (RecyclerView)var3;
      byte var5 = 1;
      var4.setPaddingRelative(0, 0, 0, var5);
   }
}
