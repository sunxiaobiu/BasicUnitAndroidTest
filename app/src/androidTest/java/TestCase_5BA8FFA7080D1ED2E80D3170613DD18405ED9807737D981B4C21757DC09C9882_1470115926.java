import android.content.Context;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BA8FFA7080D1ED2E80D3170613DD18405ED9807737D981B4C21757DC09C9882_1470115926 {
   @Test
   public void testCase() throws Exception {
      AppCompatDrawableManager var3 = AppCompatDrawableManager.get();
      Object var1 = EasyMock.createMock(Context.class);
      byte var2 = 1;
      var3.getDrawable((Context)var1, var2);
   }
}
