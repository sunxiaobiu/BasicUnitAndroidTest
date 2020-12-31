import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A4CB36F8C311DA403C395A463A4CE08E7B2BDD5EC2BF20CA6662063DC6B9EF5_682550887 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ActionBarContainer var3 = (ActionBarContainer)var2;
      Object var1 = EasyMock.createMock(Drawable.class);
      var3.setPrimaryBackground((Drawable)var1);
   }
}
