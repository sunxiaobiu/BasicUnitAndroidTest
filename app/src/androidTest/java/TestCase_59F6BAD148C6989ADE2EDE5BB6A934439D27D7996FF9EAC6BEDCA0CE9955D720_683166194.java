import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F6BAD148C6989ADE2EDE5BB6A934439D27D7996FF9EAC6BEDCA0CE9955D720_683166194 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Menu.class);
      MenuItem var2 = ((Menu)var1).findItem(2131296932);
      ActionProvider var3 = MenuItemCompat.getActionProvider(var2);
      ShareActionProvider var4 = (ShareActionProvider)var3;
      var4.setShareHistoryFileName("share_history.xml");
   }
}
