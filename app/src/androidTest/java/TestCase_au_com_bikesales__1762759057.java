import android.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bikesales__1762759057 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentManager.class);
      List var2 = ((FragmentManager)var1).getFragments();
   }
}
